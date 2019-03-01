package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1ChannelsCmyk extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.gray]
  def cmyk(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.CMYK
  def hex(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HEX
  def hsl(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HSL
  def hsv(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HSV
  def hwb(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HWB
  def lab(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.LAB
  def rgb(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.RGB
}

object Anon_1ChannelsCmyk {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.CMYK],
    hex: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HWB],
    lab: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.LAB],
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.gray],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_1ChannelsCmyk = {
    val __obj = js.Dynamic.literal(channels = channels, cmyk = cmyk, hex = hex, hsl = hsl, hsv = hsv, hwb = hwb, lab = lab, labels = labels, rgb = rgb)
  
    __obj.asInstanceOf[Anon_1ChannelsCmyk]
  }
}

