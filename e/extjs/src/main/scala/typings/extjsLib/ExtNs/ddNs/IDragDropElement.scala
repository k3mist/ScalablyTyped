package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropElement extends js.Object {
  /** [Method] Returns the X position of an html element
  		* @param el HTMLElement the element for which to get the position
  		* @returns Number the X coordinate
  		*/
  var getPosX: js.UndefOr[js.Function1[/* el */ js.UndefOr[stdLib.HTMLElement], scala.Double]] = js.undefined
  /** [Method] Returns the Y position of an html element
  		* @param el HTMLElement the element for which to get the position
  		* @returns Number the Y coordinate
  		*/
  var getPosY: js.UndefOr[js.Function1[/* el */ js.UndefOr[stdLib.HTMLElement], scala.Double]] = js.undefined
  /** [Method] Gets the scrollLeft
  		* @returns Number the document's scrollTop
  		*/
  var getScrollLeft: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets the scrollTop
  		* @returns Number the document's scrollTop
  		*/
  var getScrollTop: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the specified element style property
  		* @param el HTMLElement the element
  		* @param styleProp String the style property
  		* @returns String The value of the style property
  		*/
  var getStyle: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[stdLib.HTMLElement], 
      /* styleProp */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Method] Recursively searches the immediate parent and all child nodes for the handle element in order to determine wheter or
  		* @param node HTMLElement the html element to inspect
  		*/
  var handleWasClicked: js.UndefOr[js.Function1[/* node */ js.UndefOr[stdLib.HTMLElement], scala.Unit]] = js.undefined
  /** [Method] Sets the x y position of an element to the location of the target element
  		* @param moveEl HTMLElement The element to move
  		* @param targetEl HTMLElement The position reference element
  		*/
  var moveToEl: js.UndefOr[
    js.Function2[
      /* moveEl */ js.UndefOr[stdLib.HTMLElement], 
      /* targetEl */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Numeric array sort function
  		* @param a Number
  		* @param b Number
  		* @returns Number positive, negative or 0
  		*/
  var numericSort: js.UndefOr[
    js.Function2[/* a */ js.UndefOr[scala.Double], /* b */ js.UndefOr[scala.Double], scala.Double]
  ] = js.undefined
  /** [Method] Swap two nodes
  		* @param n1 HTMLElement the first node to swap
  		* @param n2 HTMLElement the other node to swap
  		*/
  var swapNode: js.UndefOr[
    js.Function2[
      /* n1 */ js.UndefOr[stdLib.HTMLElement], 
      /* n2 */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
}

object IDragDropElement {
  @scala.inline
  def apply(
    getPosX: js.Function1[/* el */ js.UndefOr[stdLib.HTMLElement], scala.Double] = null,
    getPosY: js.Function1[/* el */ js.UndefOr[stdLib.HTMLElement], scala.Double] = null,
    getScrollLeft: js.Function0[scala.Double] = null,
    getScrollTop: js.Function0[scala.Double] = null,
    getStyle: js.Function2[
      /* el */ js.UndefOr[stdLib.HTMLElement], 
      /* styleProp */ js.UndefOr[java.lang.String], 
      java.lang.String
    ] = null,
    handleWasClicked: js.Function1[/* node */ js.UndefOr[stdLib.HTMLElement], scala.Unit] = null,
    moveToEl: js.Function2[
      /* moveEl */ js.UndefOr[stdLib.HTMLElement], 
      /* targetEl */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ] = null,
    numericSort: js.Function2[/* a */ js.UndefOr[scala.Double], /* b */ js.UndefOr[scala.Double], scala.Double] = null,
    swapNode: js.Function2[
      /* n1 */ js.UndefOr[stdLib.HTMLElement], 
      /* n2 */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ] = null
  ): IDragDropElement = {
    val __obj = js.Dynamic.literal()
    if (getPosX != null) __obj.updateDynamic("getPosX")(getPosX)
    if (getPosY != null) __obj.updateDynamic("getPosY")(getPosY)
    if (getScrollLeft != null) __obj.updateDynamic("getScrollLeft")(getScrollLeft)
    if (getScrollTop != null) __obj.updateDynamic("getScrollTop")(getScrollTop)
    if (getStyle != null) __obj.updateDynamic("getStyle")(getStyle)
    if (handleWasClicked != null) __obj.updateDynamic("handleWasClicked")(handleWasClicked)
    if (moveToEl != null) __obj.updateDynamic("moveToEl")(moveToEl)
    if (numericSort != null) __obj.updateDynamic("numericSort")(numericSort)
    if (swapNode != null) __obj.updateDynamic("swapNode")(swapNode)
    __obj.asInstanceOf[IDragDropElement]
  }
}

