package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to modify the suggestion list returned by a spell checker.
  *
  * Basically this is needed to post-add further suggestions while keeping the originally returned reference from the spell checker. E.g. from the user
  * dictionaries.
  * @see com.sun.star.linguistic2.XSpellAlternatives
  */
trait XSetSpellAlternatives
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * set the list of suggestions to be returned.
    * @since OOo 3.0.1
    */
  def setAlternatives(aAlternatives: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
  /**
    * set the type of error found.
    * @see com.sun.star.linguistic2.SpellFailure
    * @since OOo 3.0.1
    */
  def setFailureType(nFailureType: scala.Double): scala.Unit
}

object XSetSpellAlternatives {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setAlternatives: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setFailureType: scala.Double => scala.Unit
  ): XSetSpellAlternatives = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAlternatives = js.Any.fromFunction1(setAlternatives), setFailureType = js.Any.fromFunction1(setFailureType))
  
    __obj.asInstanceOf[XSetSpellAlternatives]
  }
}

