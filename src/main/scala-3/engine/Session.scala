package engine

import scala.io.StdIn
import engine.Menu
import scala.annotation.tailrec

class Session:
  def run(): Unit =
    Menu.printMenu
    op(StdIn.readInt)

  private def op(i: Int): Unit =
    var op = (i: Int) => i  // lambda on the fly
    while true do
      op(StdIn.readInt) match
        case 0 => println("Exiting program..."); return
        case 1 => println("Creating new account...")
        case 2 => println("Logging into existing account...")
        case _ => print("Wrong input, choose again: ")

  @tailrec
  private def op2(i: Int): Unit = i match
    case 0 => println("Exiting program...")
    case _ => i match
      case 1 => println("Creating new account...")
      case 2 => println("Logging into existing account...")
      case _ => print("Wrong input, choose again: "); Menu.printMenu
      op2(StdIn.readInt)


/*
 * Design doc: how to decouple the match logic from the I/O.
 *  From what was recommended to me, the function op is not pure.  It has
 *  potential for non-deterministic behaviors so I should try to decouple it
 *  from the logic of the function.  It recommended that it is I use a class/object
 *  here because the strings are very deterministic, i.e. we already know what
 *  is to be printed out for each input case.  There is no need to make it dependent on
 *  the I/O.  In other words, we can delegate the input request and return a response
 *  object and pass that response object to the matching object.
 *
 *  This separation of logic will allow for better flexibility.  First, the request-response
 *  are clearly separated and decoupled from each other.  This prevents the app from
 *  being monolithic; it does not get locked up when the response is non-deterministic. This
 *  means that multithreading is also possible, since we can terminate the request thread if
 *  it does not return a response object.
 *
 *  This requires knowledge and experience in exception handling, which I am lacking right now.
 *  I simply do not know enough usecases to quickly whip out an implementation for try-catch.
 *  But that does not mean I am completely in the dark.  I do have some experience with
 *  writing a try-catch logic.  It just takes time and mental energy because it is still very
 *  rough experience.
 *
 * */
