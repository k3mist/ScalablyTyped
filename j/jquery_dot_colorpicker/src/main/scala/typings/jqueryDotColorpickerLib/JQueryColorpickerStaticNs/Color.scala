package typings
package jqueryDotColorpickerLib.JQueryColorpickerStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var set: scala.Boolean
  def copy(): Color
  def distance(color: Color): scala.Double
  def equals(color: Color): scala.Boolean
  def getAlpha(): scala.Double
  def getCMYK(): CMYK
  def getChannels(): jqueryDotColorpickerLib.Anon_AB
  def getHSL(): HSL
  def getHSV(): HSV
  def getLAB(): LAB
  def getRGB(): RGB
  def getSpaces(): jqueryDotColorpickerLib.Anon_Cmyk
  def limit(steps: scala.Double): scala.Unit
  def normalize(): Color
  def setAlpha(a: scala.Double): Color
  def setCMYK(c: scala.Double, m: scala.Double, y: scala.Double, k: scala.Double): Color
  def setHSL(h: scala.Double, s: scala.Double, l: scala.Double): Color
  def setHSV(h: scala.Double, s: scala.Double, v: scala.Double): Color
  def setLAB(l: scala.Double, a: scala.Double, b: scala.Double): Color
  def setRGB(r: scala.Double, g: scala.Double, b: scala.Double): Color
  def setSpaces(new_spaces: js.Any): Color
  def toCSS(): java.lang.String
  def toHEX(): java.lang.String
}

object Color {
  @scala.inline
  def apply(
    copy: js.Function0[Color],
    distance: js.Function1[Color, scala.Double],
    equals: js.Function1[Color, scala.Boolean],
    getAlpha: js.Function0[scala.Double],
    getCMYK: js.Function0[CMYK],
    getChannels: js.Function0[jqueryDotColorpickerLib.Anon_AB],
    getHSL: js.Function0[HSL],
    getHSV: js.Function0[HSV],
    getLAB: js.Function0[LAB],
    getRGB: js.Function0[RGB],
    getSpaces: js.Function0[jqueryDotColorpickerLib.Anon_Cmyk],
    limit: js.Function1[scala.Double, scala.Unit],
    normalize: js.Function0[Color],
    set: scala.Boolean,
    setAlpha: js.Function1[scala.Double, Color],
    setCMYK: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, Color],
    setHSL: js.Function3[scala.Double, scala.Double, scala.Double, Color],
    setHSV: js.Function3[scala.Double, scala.Double, scala.Double, Color],
    setLAB: js.Function3[scala.Double, scala.Double, scala.Double, Color],
    setRGB: js.Function3[scala.Double, scala.Double, scala.Double, Color],
    setSpaces: js.Function1[js.Any, Color],
    toCSS: js.Function0[java.lang.String],
    toHEX: js.Function0[java.lang.String]
  ): Color = {
    val __obj = js.Dynamic.literal(copy = copy, distance = distance, equals = equals, getAlpha = getAlpha, getCMYK = getCMYK, getChannels = getChannels, getHSL = getHSL, getHSV = getHSV, getLAB = getLAB, getRGB = getRGB, getSpaces = getSpaces, limit = limit, normalize = normalize, set = set, setAlpha = setAlpha, setCMYK = setCMYK, setHSL = setHSL, setHSV = setHSV, setLAB = setLAB, setRGB = setRGB, setSpaces = setSpaces, toCSS = toCSS, toHEX = toHEX)
  
    __obj.asInstanceOf[Color]
  }
}

