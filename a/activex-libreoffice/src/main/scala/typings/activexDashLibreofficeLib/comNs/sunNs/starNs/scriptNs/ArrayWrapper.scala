package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows an UNO sequence that is passed between different language boundries to indicate it prefers to be represented as a multidimensional array with 0
  * or 1 based indices. UNO does not natively represent Multi-Dimensional arrays, instead a sequence can have elements that are themselves sequences (an
  * array of arrays ).
  *
  * Some languages ( example BASIC ) can natively represent both Multi-Dimensional arrays and array of arrays. Those languages could represent a sequence
  * of sequences as either a Multi-Dimensional array or array of arrays. This structure allows a preference for a Multi-Dimensional array representation
  * to be specified.
  */
trait ArrayWrapper extends js.Object {
  /**
    * Contains the Array to be passed.
    *
    * Multi-dimensional arrays can only be represented as a sequence where the elements of the sequence are themselves sequences. N-Levels of indirection
    * are possible, where N is the number of dimensions. Note: its perfectly legal to use this structure with a single dimensioned array just to indicate
    * the array indexing.
    */
  var Array: js.Any
  /** Indicates whether the Array should be have 1 or 0 based indexing. */
  var IsZeroIndex: scala.Boolean
}

object ArrayWrapper {
  @scala.inline
  def apply(Array: js.Any, IsZeroIndex: scala.Boolean): ArrayWrapper = {
    val __obj = js.Dynamic.literal(Array = Array, IsZeroIndex = IsZeroIndex)
  
    __obj.asInstanceOf[ArrayWrapper]
  }
}

