package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for nw.Window.get().capturePage().
  */
trait CapturePageConfig extends js.Object {
  /**
    *  (Optional) It supports three types: "raw", "buffer" and "datauri". If ignored, it’s "datauri" by default.
    */
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Optional) The image format used to generate the image. It supports two formats: "png" and "jpeg". If ignored, it’s "jpeg" by default.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object CapturePageConfig {
  @scala.inline
  def apply(datatype: java.lang.String = null, format: java.lang.String = null): CapturePageConfig = {
    val __obj = js.Dynamic.literal()
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[CapturePageConfig]
  }
}

