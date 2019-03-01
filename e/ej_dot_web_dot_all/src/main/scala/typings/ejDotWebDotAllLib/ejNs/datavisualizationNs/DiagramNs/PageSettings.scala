package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSettings extends js.Object {
  /** Defines the maximum distance to be left between the object and the scroll bar to trigger auto scrolling
    * @Default {{ left: 15, top: 15, right: 15, bottom: 15 }}
    */
  var autoScrollBorder: js.UndefOr[js.Any] = js.undefined
  /** Defines the draggable region of diagram elements.
    * @Default {ej.datavisualization.Diagram.BoundaryConstraints.Infinite}
    */
  var boundaryConstraints: js.UndefOr[BoundaryConstraints | java.lang.String] = js.undefined
  /** Sets whether multiple pages can be created to fit all nodes and connectors
    * @Default {false}
    */
  var multiplePage: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the background color of diagram pages
    * @Default {#ffffff}
    */
  var pageBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the page border color
    * @Default {#565656}
    */
  var pageBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the border width of diagram pages
    * @Default {0}
    */
  var pageBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines the height of a page
    * @Default {null}
    */
  var pageHeight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the page margin
    * @Default {24}
    */
  var pageMargin: js.UndefOr[scala.Double] = js.undefined
  /** Sets the orientation of the page.
    * @Default {ej.datavisualization.Diagram.PageOrientations.Portrait}
    */
  var pageOrientation: js.UndefOr[PageOrientations | java.lang.String] = js.undefined
  /** Defines the height of a diagram page
    * @Default {null}
    */
  var pageWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines the scrollable region of diagram.
    * @Default {ej.datavisualization.Diagram.ScrollLimit.Infinite}
    */
  var scrollLimit: js.UndefOr[ScrollLimit | java.lang.String] = js.undefined
  /** Defines the scrollable area of diagram. Applicable, if the scroll limit is &quot;limited&quot;.
    * @Default {null}
    */
  var scrollableArea: js.UndefOr[js.Any] = js.undefined
  /** Enables or disables the page breaks
    * @Default {false}
    */
  var showPageBreak: js.UndefOr[scala.Boolean] = js.undefined
}

object PageSettings {
  @scala.inline
  def apply(
    autoScrollBorder: js.Any = null,
    boundaryConstraints: BoundaryConstraints | java.lang.String = null,
    multiplePage: js.UndefOr[scala.Boolean] = js.undefined,
    pageBackgroundColor: java.lang.String = null,
    pageBorderColor: java.lang.String = null,
    pageBorderWidth: scala.Int | scala.Double = null,
    pageHeight: scala.Int | scala.Double = null,
    pageMargin: scala.Int | scala.Double = null,
    pageOrientation: PageOrientations | java.lang.String = null,
    pageWidth: scala.Int | scala.Double = null,
    scrollLimit: ScrollLimit | java.lang.String = null,
    scrollableArea: js.Any = null,
    showPageBreak: js.UndefOr[scala.Boolean] = js.undefined
  ): PageSettings = {
    val __obj = js.Dynamic.literal()
    if (autoScrollBorder != null) __obj.updateDynamic("autoScrollBorder")(autoScrollBorder)
    if (boundaryConstraints != null) __obj.updateDynamic("boundaryConstraints")(boundaryConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplePage)) __obj.updateDynamic("multiplePage")(multiplePage)
    if (pageBackgroundColor != null) __obj.updateDynamic("pageBackgroundColor")(pageBackgroundColor)
    if (pageBorderColor != null) __obj.updateDynamic("pageBorderColor")(pageBorderColor)
    if (pageBorderWidth != null) __obj.updateDynamic("pageBorderWidth")(pageBorderWidth.asInstanceOf[js.Any])
    if (pageHeight != null) __obj.updateDynamic("pageHeight")(pageHeight.asInstanceOf[js.Any])
    if (pageMargin != null) __obj.updateDynamic("pageMargin")(pageMargin.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (pageWidth != null) __obj.updateDynamic("pageWidth")(pageWidth.asInstanceOf[js.Any])
    if (scrollLimit != null) __obj.updateDynamic("scrollLimit")(scrollLimit.asInstanceOf[js.Any])
    if (scrollableArea != null) __obj.updateDynamic("scrollableArea")(scrollableArea)
    if (!js.isUndefined(showPageBreak)) __obj.updateDynamic("showPageBreak")(showPageBreak)
    __obj.asInstanceOf[PageSettings]
  }
}

