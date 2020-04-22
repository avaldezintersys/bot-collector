package com.alertinnovation.poc.bot.simulator.akka.actors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.util.Timeout;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.FiniteDuration;
import static akka.pattern.Patterns.ask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static com.alertinnovation.poc.bot.simulator.akka.spring.SpringExtProvider.SPRING_EXTENSION_PROVIDER;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestActorTest {

    @Autowired
    private ActorSystem actorSystem;

    @Test
    public void testActorCreate() throws TimeoutException, InterruptedException {
        ActorRef ref = actorSystem.actorOf(
                SPRING_EXTENSION_PROVIDER
                        .get(actorSystem)
                        .create("testActor"), "testActor");

        FiniteDuration duration = FiniteDuration.create(1, TimeUnit.SECONDS);
        Timeout timeout = Timeout.durationToTimeout(duration);
        Future<Object> result = ask(ref, "hello World", timeout);
        Assert.assertEquals("hello World", Await.result(result, duration));
    }

    @After
    public void tearDown() throws InterruptedException, TimeoutException {
        Await.ready(actorSystem.whenTerminated(), FiniteDuration.create(1, TimeUnit.SECONDS));
    }
}