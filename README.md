# Quarkus Application & Deploy Final App to Openshift.

In this sample I will show you how to create and deploy a quarkus application to Openshift 4.

Requirements:
- Java 11/OpenJDK
- OCP 4
- oc cli(But you can use the webconsole, not is covered at this sample).

We're gonna build an Quarkus application with speficic extensions listed below:
 - ORM(PANACHE)
 - HealthChecks(SmallRye)
 - Event-Driven Messaging(Vert.x).
