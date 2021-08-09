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

