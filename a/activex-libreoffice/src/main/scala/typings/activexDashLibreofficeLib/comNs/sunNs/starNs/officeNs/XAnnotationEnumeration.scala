package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An enumeration for a set of annotations. */
trait XAnnotationEnumeration extends js.Object {
  /** tests whether this enumeration contains more elements. */
  def hasMoreElements(): scala.Boolean
  /**
    * @returns the next element of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    */
  def nextElement(): XAnnotation
}

object XAnnotationEnumeration {
  @scala.inline
  def apply(hasMoreElements: js.Function0[scala.Boolean], nextElement: js.Function0[XAnnotation]): XAnnotationEnumeration = {
    val __obj = js.Dynamic.literal(hasMoreElements = hasMoreElements, nextElement = nextElement)
  
    __obj.asInstanceOf[XAnnotationEnumeration]
  }
}

