package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventPostDispatch[TTarget]
  extends jqueryLib.JQueryNs._SpecialEventHook[TTarget, js.Any] {
  def postDispatch(`this`: TTarget, event: jqueryLib.JQueryNs.Event): scala.Unit
}

