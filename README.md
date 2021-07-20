## Simple Banking Backend, an sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).


### Project Description
This project is a rebuild of the simple banking system project I previously built in Python two months ago.  This project will be written in mostly Scala and some Java (where support for Java API is more accessible).  I will be using the SQLite API for two reasons:
1. I am still new to Scala3 and do not know many APIs for Scala3
2. I want to practice interoperability between Scala and Java

Java is a mature language; therefore, its documentations for SQLite integration should be much more abundant.

This system will consist of an SQLite database and a CLI to make queries and commits to the database.  In this project, I also would like to try to apply multi-threading.  I plan to accomplish this by encapsulating interactions for each user into a session, which in turn can be run in its own separate thread.  The user of this system should be able to accomplish the following tasks:

- Create a new account
- Log in to an existing account
- Exit from the program


### Future Plan
Once the prototype has taken form, I plan to develop and expand it further by replacing the SQLite API with PostgreSQL.


### Tech Stack
- Scala3
- Java adopt@openJDK-1.11.0.11
- SQLite (API for Java)
(Future: PostgreSQL)
