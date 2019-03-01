package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adapts a Secret into a volume.
  *
  * The contents of the target Secret's Data field will be presented in a volume as files using
  * the keys in the Data field as the file names. Secret volumes support ownership management and
  * SELinux relabeling.
  */
trait SecretVolumeSource extends js.Object {
  /**
    * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
    * Defaults to 0644. Directories within the path are not affected by this setting. This might
    * be in conflict with other options that affect the file mode, like fsGroup, and the result
    * can be other mode bits set.
    */
  val defaultMode: scala.Double
  /**
    * If unspecified, each key-value pair in the Data field of the referenced Secret will be
    * projected into the volume as a file whose name is the key and content is the value. If
    * specified, the listed keys will be projected into the specified paths, and unlisted keys
    * will not be present. If a key is specified which is not present in the Secret, the volume
    * setup will error unless it is marked optional. Paths must be relative and may not contain
    * the '..' path or start with '..'.
    */
  val items: js.Array[KeyToPath]
  /**
    * Specify whether the Secret or it's keys must be defined
    */
  val optional: scala.Boolean
  /**
    * Name of the secret in the pod's namespace to use. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  val secretName: java.lang.String
}

object SecretVolumeSource {
  @scala.inline
  def apply(
    defaultMode: scala.Double,
    items: js.Array[KeyToPath],
    optional: scala.Boolean,
    secretName: java.lang.String
  ): SecretVolumeSource = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode, items = items, optional = optional, secretName = secretName)
  
    __obj.asInstanceOf[SecretVolumeSource]
  }
}

