package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnpackagedExtensionData extends js.Object {
  var categories: js.Array[java.lang.String]
  var description: java.lang.String
  var displayName: java.lang.String
  var draftId: java.lang.String
  var extensionName: java.lang.String
  var installationTargets: js.Array[InstallationTarget]
  var isConvertedToMarkdown: scala.Boolean
  var pricingCategory: java.lang.String
  var product: java.lang.String
  var publisherName: java.lang.String
  var qnAEnabled: scala.Boolean
  var referralUrl: java.lang.String
  var repositoryUrl: java.lang.String
  var tags: js.Array[java.lang.String]
  var version: java.lang.String
  var vsixId: java.lang.String
}

object UnpackagedExtensionData {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    description: java.lang.String,
    displayName: java.lang.String,
    draftId: java.lang.String,
    extensionName: java.lang.String,
    installationTargets: js.Array[InstallationTarget],
    isConvertedToMarkdown: scala.Boolean,
    pricingCategory: java.lang.String,
    product: java.lang.String,
    publisherName: java.lang.String,
    qnAEnabled: scala.Boolean,
    referralUrl: java.lang.String,
    repositoryUrl: java.lang.String,
    tags: js.Array[java.lang.String],
    version: java.lang.String,
    vsixId: java.lang.String
  ): UnpackagedExtensionData = {
    val __obj = js.Dynamic.literal(categories = categories, description = description, displayName = displayName, draftId = draftId, extensionName = extensionName, installationTargets = installationTargets, isConvertedToMarkdown = isConvertedToMarkdown, pricingCategory = pricingCategory, product = product, publisherName = publisherName, qnAEnabled = qnAEnabled, referralUrl = referralUrl, repositoryUrl = repositoryUrl, tags = tags, version = version, vsixId = vsixId)
  
    __obj.asInstanceOf[UnpackagedExtensionData]
  }
}

