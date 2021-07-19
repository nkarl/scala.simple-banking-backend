## Simple Banking Backend, a sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).


### Description
This is a rebuild of the simple banking system project I have previously built in Python.  This project will be written in Scala and Java with an SQLite database.  I will be using the SQLite API for Java because Java is a mature language thus should have good documentations for the API.

The system will consist of a SQLite database and a CLI to make queries and commits to the database.  In this project, I also would like to try learning and applying threading to this application by isolating queries to a separate thread.

Once the prototype has taken form, I plan to develop and expand it further by replacing the SQLite API with PostgreSQL.


### Tech stack
- Scala3
- Java adopt@openJDK-1.11.0.11
- SQLite
(Future: PostgreSQL)
