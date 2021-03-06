package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Register specially adjusted instances of content providers on URL templates and supplementary arguments.
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XParameterizedContentProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Deregisters a content provider.
    * @param Template A URL template. If the input is malformed or too complex, an IllegalArgumentException may be raised.
    * @param Arguments Any supplementary arguments required by this {@link XContentProvider} , represented as a single string. If the input is malformed, an {
    * @returns Either this {@link XContentProvider} , or another, specially adjusted version of this {@link XContentProvider} (this flexibility allows for diffe
    */
  def deregisterInstance(Template: java.lang.String, Arguments: java.lang.String): XContentProvider
  /**
    * Register a content provider on a URL template and supplementary arguments.
    * @param Template A URL template. If the input is malformed or too complex, an {@link com.sun.star.lang.IllegalArgumentException} may be raised.
    * @param Arguments Any supplementary arguments required by this {@link XContentProvider} , represented as a single string. If the input is malformed, an {
    * @param ReplaceExisting If true, and if the given Template conflicts with an already registered instance, the old registration is replaced by the new one
    * @returns Either this {@link XContentProvider} , or another, specially adjusted version of this {@link XContentProvider} (this flexibility allows for diffe
    */
  def registerInstance(Template: java.lang.String, Arguments: java.lang.String, ReplaceExisting: scala.Boolean): XContentProvider
}

object XParameterizedContentProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    deregisterInstance: (java.lang.String, java.lang.String) => XContentProvider,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerInstance: (java.lang.String, java.lang.String, scala.Boolean) => XContentProvider,
    release: () => scala.Unit
  ): XParameterizedContentProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), deregisterInstance = js.Any.fromFunction2(deregisterInstance), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XParameterizedContentProvider]
  }
}

