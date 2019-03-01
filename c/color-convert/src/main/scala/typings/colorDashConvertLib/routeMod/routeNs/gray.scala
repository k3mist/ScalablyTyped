package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait gray extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.CMYK
  def hcg(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.XYZ
}

object gray {
  @scala.inline
  def apply(
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.ANSI16],
    ansi256: js.Function1[
      colorDashConvertLib.conversionsMod.GRAY, 
      colorDashConvertLib.conversionsMod.ANSI256
    ],
    apple: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.APPLE],
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.CMYK],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HCG],
    hex: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[
      colorDashConvertLib.conversionsMod.GRAY, 
      colorDashConvertLib.conversionsMod.KEYWORD
    ],
    lab: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.LAB],
    lch: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.LCH],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.RGB],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.GRAY, colorDashConvertLib.conversionsMod.XYZ]
  ): gray = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, ansi256 = ansi256, apple = apple, cmyk = cmyk, hcg = hcg, hex = hex, hsl = hsl, hsv = hsv, hwb = hwb, keyword = keyword, lab = lab, lch = lch, rgb = rgb, xyz = xyz)
  
    __obj.asInstanceOf[gray]
  }
}

