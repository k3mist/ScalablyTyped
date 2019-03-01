package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockSizeBytesCompressionEnableDictionaryCompression extends js.Object {
  var blockSizeBytes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var compression: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var enableDictionaryCompression: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var maxPaddingBytes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var pageSizeBytes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var writerVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_BlockSizeBytesCompressionEnableDictionaryCompression {
  @scala.inline
  def apply(
    blockSizeBytes: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    compression: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    enableDictionaryCompression: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    maxPaddingBytes: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    pageSizeBytes: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    writerVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BlockSizeBytesCompressionEnableDictionaryCompression = {
    val __obj = js.Dynamic.literal()
    if (blockSizeBytes != null) __obj.updateDynamic("blockSizeBytes")(blockSizeBytes.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (enableDictionaryCompression != null) __obj.updateDynamic("enableDictionaryCompression")(enableDictionaryCompression.asInstanceOf[js.Any])
    if (maxPaddingBytes != null) __obj.updateDynamic("maxPaddingBytes")(maxPaddingBytes.asInstanceOf[js.Any])
    if (pageSizeBytes != null) __obj.updateDynamic("pageSizeBytes")(pageSizeBytes.asInstanceOf[js.Any])
    if (writerVersion != null) __obj.updateDynamic("writerVersion")(writerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlockSizeBytesCompressionEnableDictionaryCompression]
  }
}

