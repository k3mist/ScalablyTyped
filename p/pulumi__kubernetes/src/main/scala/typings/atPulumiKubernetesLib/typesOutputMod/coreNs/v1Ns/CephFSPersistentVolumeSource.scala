package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not
  * support ownership management or SELinux relabeling.
  */
trait CephFSPersistentVolumeSource extends js.Object {
  /**
    * Required: Monitors is a collection of Ceph monitors More info:
    * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val monitors: js.Array[java.lang.String]
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  val path: java.lang.String
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val readOnly: scala.Boolean
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret
    * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val secretFile: java.lang.String
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty.
    * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val secretRef: SecretReference
  /**
    * Optional: User is the rados user name, default is admin More info:
    * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val user: java.lang.String
}

object CephFSPersistentVolumeSource {
  @scala.inline
  def apply(
    monitors: js.Array[java.lang.String],
    path: java.lang.String,
    readOnly: scala.Boolean,
    secretFile: java.lang.String,
    secretRef: SecretReference,
    user: java.lang.String
  ): CephFSPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(monitors = monitors, path = path, readOnly = readOnly, secretFile = secretFile, secretRef = secretRef, user = user)
  
    __obj.asInstanceOf[CephFSPersistentVolumeSource]
  }
}

