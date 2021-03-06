package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomLayout")
@js.native
class CustomLayout protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Background: ShapeRange = js.native
  val CustomerData: activexDashPowerpointLib.PowerPointNs.CustomerData = js.native
  val Design: activexDashPowerpointLib.PowerPointNs.Design = js.native
  var DisplayMasterShapes: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var FollowMasterBackground: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HeadersFooters: activexDashPowerpointLib.PowerPointNs.HeadersFooters = js.native
  val Height: scala.Double = js.native
  val Hyperlinks: activexDashPowerpointLib.PowerPointNs.Hyperlinks = js.native
  val Index: scala.Double = js.native
  var MatchingName: java.lang.String = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.CustomLayout_typekey`: CustomLayout = js.native
  var Preserved: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Shapes: activexDashPowerpointLib.PowerPointNs.Shapes = js.native
  val SlideShowTransition: activexDashPowerpointLib.PowerPointNs.SlideShowTransition = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: activexDashOfficeLib.OfficeNs.ThemeColorScheme = js.native
  val TimeLine: activexDashPowerpointLib.PowerPointNs.TimeLine = js.native
  val Width: scala.Double = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Duplicate(): CustomLayout = js.native
  def MoveTo(toPos: scala.Double): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def ThemeColorScheme(Index: activexDashOfficeLib.OfficeNs.MsoThemeColorSchemeIndex): activexDashOfficeLib.OfficeNs.ThemeColor = js.native
}

