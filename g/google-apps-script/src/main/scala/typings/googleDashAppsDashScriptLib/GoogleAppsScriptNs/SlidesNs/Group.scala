package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Group = js.native
  def bringForward(): Group = js.native
  def bringToFront(): Group = js.native
  def duplicate(): PageElement = js.native
  def getChildren(): js.Array[PageElement] = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): java.lang.String = js.native
  def getHeight(): stdLib.Number = js.native
  def getInherentHeight(): stdLib.Number = js.native
  def getInherentWidth(): stdLib.Number = js.native
  def getLeft(): stdLib.Number = js.native
  def getObjectId(): java.lang.String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): stdLib.Number = js.native
  def getTitle(): java.lang.String = js.native
  def getTop(): stdLib.Number = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): stdLib.Number = js.native
  def preconcatenateTransform(transform: AffineTransform): Group = js.native
  def remove(): scala.Unit = js.native
  def scaleHeight(ratio: stdLib.Number): Group = js.native
  def scaleWidth(ratio: stdLib.Number): Group = js.native
  def select(): scala.Unit = js.native
  def select(replace: scala.Boolean): scala.Unit = js.native
  def sendBackward(): Group = js.native
  def sendToBack(): Group = js.native
  def setDescription(description: java.lang.String): Group = js.native
  def setHeight(height: stdLib.Number): Group = js.native
  def setLeft(left: stdLib.Number): Group = js.native
  def setRotation(angle: stdLib.Number): Group = js.native
  def setTitle(title: java.lang.String): Group = js.native
  def setTop(top: stdLib.Number): Group = js.native
  def setTransform(transform: AffineTransform): Group = js.native
  def setWidth(width: stdLib.Number): Group = js.native
  def ungroup(): scala.Unit = js.native
}

