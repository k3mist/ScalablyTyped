package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OwnerReference contains enough information to let you identify an owning object. An owning
  * object must be in the same namespace as the dependent, or be cluster-scoped, so there is no
  * namespace field.
  */
trait OwnerReference extends js.Object {
  /**
    * API version of the referent.
    */
  val apiVersion: java.lang.String
  /**
    * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
    * deleted from the key-value store until this reference is removed. Defaults to false. To set
    * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable
    * Entity) will be returned.
    */
  val blockOwnerDeletion: scala.Boolean
  /**
    * If true, this reference points to the managing controller.
    */
  val controller: scala.Boolean
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: java.lang.String
  /**
    * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  val name: java.lang.String
  /**
    * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  val uid: java.lang.String
}

object OwnerReference {
  @scala.inline
  def apply(
    apiVersion: java.lang.String,
    blockOwnerDeletion: scala.Boolean,
    controller: scala.Boolean,
    kind: java.lang.String,
    name: java.lang.String,
    uid: java.lang.String
  ): OwnerReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, blockOwnerDeletion = blockOwnerDeletion, controller = controller, kind = kind, name = name, uid = uid)
  
    __obj.asInstanceOf[OwnerReference]
  }
}

