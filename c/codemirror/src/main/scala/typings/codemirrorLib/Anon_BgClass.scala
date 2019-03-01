package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BgClass extends js.Object {
  var bgClass: java.lang.String
  /** Object mapping gutter IDs to marker elements. */
  var gutterMarkers: js.Any
  var handle: js.Any
  var line: js.Any
  var text: java.lang.String
  var textClass: java.lang.String
  /** Array of line widgets attached to this line. */
  var widgets: js.Any
  var wrapClass: java.lang.String
}

object Anon_BgClass {
  @scala.inline
  def apply(
    bgClass: java.lang.String,
    gutterMarkers: js.Any,
    handle: js.Any,
    line: js.Any,
    text: java.lang.String,
    textClass: java.lang.String,
    widgets: js.Any,
    wrapClass: java.lang.String
  ): Anon_BgClass = {
    val __obj = js.Dynamic.literal(bgClass = bgClass, gutterMarkers = gutterMarkers, handle = handle, line = line, text = text, textClass = textClass, widgets = widgets, wrapClass = wrapClass)
  
    __obj.asInstanceOf[Anon_BgClass]
  }
}

