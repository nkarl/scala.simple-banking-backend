package engine

import scala.io.StdIn
import engine.Menu

class Session:
  def run(): Unit =
    Menu.printMenu
    var op = (i: Int) => i
    while true do
      op(StdIn.readInt) match
        case 0 => 
          println("Exiting program...")
          return
        case 1 => println("Creating new account...")
        case 2 => println("Logging into existing account...")
        case _ => print("Wrong input, choose again: ")
