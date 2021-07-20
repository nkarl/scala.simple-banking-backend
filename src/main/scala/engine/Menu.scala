package engine.Menu

import java.util.Scanner

def mockCLI: Unit =
  print("Enter a small integer to test: ")
  val max = (new Scanner(System.in)).nextInt
  println(s"This a mock test; it prints all numbers from 0 to $max, inclusive:")
  (0 to max).map(x => println(x))


def printMenu: Unit =
  val menu = """
    -----MENU BEGINS ----------------------
    1. Create Account
    2. Log In
    0. Exit
    -----MENU ENDS ------------------------
    """.stripMargin
  print(menu)
