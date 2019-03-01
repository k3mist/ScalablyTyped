package typings
package gulpDashSassLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: scala.Double
  var end: stdLib.Date
  var entry: java.lang.String
  var includedFiles: js.Array[java.lang.String]
  var start: stdLib.Date
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Double,
    end: stdLib.Date,
    entry: java.lang.String,
    includedFiles: js.Array[java.lang.String],
    start: stdLib.Date
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration, end = end, entry = entry, includedFiles = includedFiles, start = start)
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

