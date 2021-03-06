package typings
package timezonecompleteLib.distLibTimesourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSource extends js.Object {
  /**
    * Return the current date+time as a javascript Date object
    */
  def now(): stdLib.Date
}

object TimeSource {
  @scala.inline
  def apply(now: () => stdLib.Date): TimeSource = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
  
    __obj.asInstanceOf[TimeSource]
  }
}

