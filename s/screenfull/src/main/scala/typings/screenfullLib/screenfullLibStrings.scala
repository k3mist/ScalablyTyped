package typings
package screenfullLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object screenfullLibStrings {
  @js.native
  sealed trait change extends EventNameMap
  
  @js.native
  sealed trait error extends EventNameMap
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}

