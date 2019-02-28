package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillPattern extends Fill {
  var bgColor: js.UndefOr[Color] = js.undefined
  var fgColor: js.UndefOr[Color] = js.undefined
  var pattern: FillPatterns
  var `type`: exceljsLib.exceljsLibStrings.pattern
}

