package zgs.sync

object Sync {
  def spawn(code: => Unit) : Unit =
    new Thread(new Runnable { def run : Unit = { code } }) start
  
  def join(code: => Unit) : Unit = {
    val t = new Thread(new Runnable { def run : Unit = { code } })
    t.start
    t.join
  }
  
}
