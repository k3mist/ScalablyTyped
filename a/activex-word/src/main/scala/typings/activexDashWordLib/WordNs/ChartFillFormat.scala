package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ChartFillFormat")
@js.native
class ChartFillFormat protected () extends js.Object {
  val Application: js.Any = js.native
  val BackColor: ChartColorFormat = js.native
  val Creator: scala.Double = js.native
  val ForeColor: ChartColorFormat = js.native
  val GradientColorType: activexDashOfficeLib.OfficeNs.MsoGradientColorType = js.native
  val GradientDegree: scala.Double = js.native
  val GradientStyle: activexDashOfficeLib.OfficeNs.MsoGradientStyle = js.native
  val GradientVariant: scala.Double = js.native
  val Parent: js.Any = js.native
  val Pattern: activexDashOfficeLib.OfficeNs.MsoPatternType = js.native
  val PresetGradientType: activexDashOfficeLib.OfficeNs.MsoPresetGradientType = js.native
  val PresetTexture: activexDashOfficeLib.OfficeNs.MsoPresetTexture = js.native
  val TextureName: java.lang.String = js.native
  val TextureType: activexDashOfficeLib.OfficeNs.MsoTextureType = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoFillType = js.native
  var Visible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var `Word.ChartFillFormat_typekey`: ChartFillFormat = js.native
  def OneColorGradient(Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle, Variant: scala.Double, Degree: scala.Double): scala.Unit = js.native
  def Patterned(Pattern: activexDashOfficeLib.OfficeNs.MsoPatternType): scala.Unit = js.native
  def PresetGradient(
    Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle,
    Variant: scala.Double,
    PresetGradientType: activexDashOfficeLib.OfficeNs.MsoPresetGradientType
  ): scala.Unit = js.native
  def PresetTextured(PresetTexture: activexDashOfficeLib.OfficeNs.MsoPresetTexture): scala.Unit = js.native
  def Solid(): scala.Unit = js.native
  def TwoColorGradient(Style: activexDashOfficeLib.OfficeNs.MsoGradientStyle, Variant: scala.Double): scala.Unit = js.native
  def UserPicture(): scala.Unit = js.native
  def UserPicture(PictureFile: js.Any): scala.Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any): scala.Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any): scala.Unit = js.native
  def UserPicture(PictureFile: js.Any, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): scala.Unit = js.native
  def UserTextured(TextureFile: java.lang.String): scala.Unit = js.native
}

