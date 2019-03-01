package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionVersion describes a version for CRD.
  */
trait CustomResourceDefinitionVersion extends js.Object {
  /**
    * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name.
    * Defaults to a created-at column. Top-level and per-version columns are mutually exclusive.
    * Per-version columns must not all be set to identical values (top-level columns should be
    * used instead) This field is alpha-level and is only honored by servers that enable the
    * CustomResourceWebhookConversion feature. NOTE: CRDs created prior to 1.13 populated the
    * top-level additionalPrinterColumns field by default. To apply an update that changes to
    * per-version additionalPrinterColumns, the top-level additionalPrinterColumns field must be
    * explicitly set to null
    */
  val additionalPrinterColumns: js.Array[CustomResourceColumnDefinition]
  /**
    * Name is the version name, e.g. “v1”, “v2beta1”, etc.
    */
  val name: java.lang.String
  /**
    * Schema describes the schema for CustomResource used in validation, pruning, and defaulting.
    * Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all
    * be set to identical values (top-level validation schema should be used instead) This field
    * is alpha-level and is only honored by servers that enable the
    * CustomResourceWebhookConversion feature.
    */
  val schema: CustomResourceValidation
  /**
    * Served is a flag enabling/disabling this version from being served via REST APIs
    */
  val served: scala.Boolean
  /**
    * Storage flags the version as storage version. There must be exactly one flagged as storage
    * version.
    */
  val storage: scala.Boolean
  /**
    * Subresources describes the subresources for CustomResource Top-level and per-version
    * subresources are mutually exclusive. Per-version subresources must not all be set to
    * identical values (top-level subresources should be used instead) This field is alpha-level
    * and is only honored by servers that enable the CustomResourceWebhookConversion feature.
    */
  val subresources: CustomResourceSubresources
}

object CustomResourceDefinitionVersion {
  @scala.inline
  def apply(
    additionalPrinterColumns: js.Array[CustomResourceColumnDefinition],
    name: java.lang.String,
    schema: CustomResourceValidation,
    served: scala.Boolean,
    storage: scala.Boolean,
    subresources: CustomResourceSubresources
  ): CustomResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal(additionalPrinterColumns = additionalPrinterColumns, name = name, schema = schema, served = served, storage = storage, subresources = subresources)
  
    __obj.asInstanceOf[CustomResourceDefinitionVersion]
  }
}

