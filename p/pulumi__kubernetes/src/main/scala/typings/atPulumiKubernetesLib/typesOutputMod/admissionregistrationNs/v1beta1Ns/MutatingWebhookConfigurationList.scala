package typings
package atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
  */
trait MutatingWebhookConfigurationList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  /**
    * List of MutatingWebhookConfiguration.
    */
  val items: js.Array[MutatingWebhookConfiguration]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.MutatingWebhookConfigurationList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object MutatingWebhookConfigurationList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`,
    items: js.Array[MutatingWebhookConfiguration],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.MutatingWebhookConfigurationList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): MutatingWebhookConfigurationList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[MutatingWebhookConfigurationList]
  }
}

