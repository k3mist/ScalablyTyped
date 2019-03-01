package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object supporting this interface indicates to interested parties or clients the name of the default propery for this object.
  *
  * For example where ExampleObject is an instance of an Object that supports this interface which returns the default property name "Value".A scripting
  * engine could use this information to support syntax like
  *
  * ExampleObject = "foo"
  *
  * which would be equivalent to writing
  *
  * ExampleObject.Value = "foo"
  *
  * or
  *
  * bar = ExampleObject
  *
  * which would be equivalent to writing
  *
  * bar = ExampleObject.Value
  */
trait XDefaultProperty
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the name of the default property
    * @returns The `string` name of default property
    */
  val DefaultPropertyName: java.lang.String
  /**
    * Returns the name of the default property
    * @returns The `string` name of default property
    */
  def getDefaultPropertyName(): java.lang.String
}

object XDefaultProperty {
  @scala.inline
  def apply(
    DefaultPropertyName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getDefaultPropertyName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDefaultProperty = {
    val __obj = js.Dynamic.literal(DefaultPropertyName = DefaultPropertyName, acquire = acquire, getDefaultPropertyName = getDefaultPropertyName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDefaultProperty]
  }
}

