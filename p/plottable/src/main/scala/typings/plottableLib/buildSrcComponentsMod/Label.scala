package typings
package plottableLib.buildSrcComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components", "Label")
@js.native
/**
  * A Label is a Component that displays a single line of text.
  *
  * @constructor
  * @param {string} [displayText=""] The text of the Label.
  * @param {number} [angle=0] The angle of the Label in degrees (-90/0/90). 0 is horizontal.
  */
class Label ()
  extends plottableLib.buildSrcComponentsLabelMod.Label {
  def this(displayText: java.lang.String) = this()
  def this(displayText: java.lang.String, angle: scala.Double) = this()
}

