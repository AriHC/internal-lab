package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object RepeatUntil extends App {
  
  // define the new control-flow structure here
  class repeat(body : =>Unit) {
    def until(test : =>Boolean) {
      body
      if (!test) {
	until(test)
      }
    }
  }
      
  object repeat {
    def apply(body : =>Unit) : repeat = new repeat(body)
  }


  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)
}

