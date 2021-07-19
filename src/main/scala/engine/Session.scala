package engine.Session

import engine.Menu

class Session:
  def runSession(run: Boolean): Unit = run match
    case false =>
      return
    case true =>
      var i: Int = 0
      while 
        i < 10
      do
        i = i + 1
        println("session is running...")
      println("session stopped.")
