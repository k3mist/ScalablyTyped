package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an IDL sequence and provides dynamic access to instances of that sequence. This interface supports widening conversion when getting or
  * setting elements.
  */
trait XIdlArray
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns element at given index.
    * @param aArray sequence instance
    * @param nIndex index
    * @returns value
    * @throws IllegalArgumentException if the specified object is not a sequence or if the specified object is null
    * @throws ArrayIndexOutOfBoundsException if the specified index argument is negative, or if it is greater than or equal to the length of the specified sequence.
    */
  def get(aArray: js.Any, nIndex: scala.Double): js.Any
  /**
    * Returns the length of the given sequence.
    * @param array sequence instance
    * @returns length of sequence
    */
  def getLen(array: js.Any): scala.Double
  /**
    * Rellocates the length of the sequence instance.
    * @param array sequence instance
    * @param length new length of sequence
    */
  def realloc(array: js.Array[_], length: scala.Double): scala.Unit
  /**
    * Sets a new value at given index.
    * @param aArray sequence instance
    * @param nIndex index
    * @param aNewValue new value to be set
    * @throws IllegalArgumentException if the specified object is not a sequence or if the specified object is null
    * @throws ArrayIndexOutOfBoundsException if the specified index argument is negative, or if it is greater than or equal to the length of the specified sequence.
    */
  def set(aArray: js.Array[_], nIndex: scala.Double, aNewValue: js.Any): scala.Unit
}

object XIdlArray {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    get: js.Function2[js.Any, scala.Double, js.Any],
    getLen: js.Function1[js.Any, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    realloc: js.Function2[js.Array[_], scala.Double, scala.Unit],
    release: js.Function0[scala.Unit],
    set: js.Function3[js.Array[_], scala.Double, js.Any, scala.Unit]
  ): XIdlArray = {
    val __obj = js.Dynamic.literal(acquire = acquire, get = get, getLen = getLen, queryInterface = queryInterface, realloc = realloc, release = release, set = set)
  
    __obj.asInstanceOf[XIdlArray]
  }
}

