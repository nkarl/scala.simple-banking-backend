package engine

import scala.io.StdIn
import engine.Menu

class Session:
  def runSession(): Unit =
    Menu.printMenu
    while true do
      var op = StdIn.readInt
      op match
        case 0 => return
        case 1 => println("Creating new account...")
        case 2 => println("Logging into existing account...")
        case _ => print("Wrong input, choose again: ")
