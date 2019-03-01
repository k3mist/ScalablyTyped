package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionProviderDetails extends js.Object {
  /**
    * Friendly name for the provider.
    */
  var displayName: java.lang.String
  /**
    * Unique identifier for this provider. The provider name can be used to cache the contribution data and refer back to it when looking for changes
    */
  var name: java.lang.String
  /**
    * Properties associated with the provider
    */
  var properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Version of contributions assoicated with this contribution provider.
    */
  var version: java.lang.String
}

object ContributionProviderDetails {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    name: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    version: java.lang.String
  ): ContributionProviderDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName, name = name, properties = properties, version = version)
  
    __obj.asInstanceOf[ContributionProviderDetails]
  }
}

