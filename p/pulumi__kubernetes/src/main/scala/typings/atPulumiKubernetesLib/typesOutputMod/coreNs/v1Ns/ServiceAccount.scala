package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral
  * systems, for an identity * a principal that can be authenticated and authorized * a set of
  * secrets
  */
trait ServiceAccount extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1
  /**
    * AutomountServiceAccountToken indicates whether pods running as this service account should
    * have an API token automatically mounted. Can be overridden at the pod level.
    */
  val automountServiceAccountToken: scala.Boolean
  /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for
    * pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are
    * distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are
    * only accessed by the kubelet. More info:
    * https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    */
  val imagePullSecrets: js.Array[LocalObjectReference]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceAccount
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Secrets is the list of secrets allowed to be used by pods running using this
    * ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
    */
  val secrets: js.Array[ObjectReference]
}

object ServiceAccount {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1,
    automountServiceAccountToken: scala.Boolean,
    imagePullSecrets: js.Array[LocalObjectReference],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceAccount,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    secrets: js.Array[ObjectReference]
  ): ServiceAccount = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, automountServiceAccountToken = automountServiceAccountToken, imagePullSecrets = imagePullSecrets, kind = kind, metadata = metadata, secrets = secrets)
  
    __obj.asInstanceOf[ServiceAccount]
  }
}

