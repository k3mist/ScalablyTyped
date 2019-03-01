package typings
package atPulumiAwsLib.dmsReplicationTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationTaskState extends js.Object {
  /**
    * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
    */
  val cdcStartTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
    */
  val migrationType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the replication task.
    */
  val replicationTaskArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The replication task identifier.
    */
  val replicationTaskId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
    */
  val replicationTaskSettings: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
    */
  val sourceEndpointArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
    */
  val tableMappings: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
    */
  val targetEndpointArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object ReplicationTaskState {
  @scala.inline
  def apply(
    cdcStartTime: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    migrationType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    replicationInstanceArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    replicationTaskArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    replicationTaskId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    replicationTaskSettings: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sourceEndpointArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tableMappings: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    targetEndpointArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): ReplicationTaskState = {
    val __obj = js.Dynamic.literal()
    if (cdcStartTime != null) __obj.updateDynamic("cdcStartTime")(cdcStartTime.asInstanceOf[js.Any])
    if (migrationType != null) __obj.updateDynamic("migrationType")(migrationType.asInstanceOf[js.Any])
    if (replicationInstanceArn != null) __obj.updateDynamic("replicationInstanceArn")(replicationInstanceArn.asInstanceOf[js.Any])
    if (replicationTaskArn != null) __obj.updateDynamic("replicationTaskArn")(replicationTaskArn.asInstanceOf[js.Any])
    if (replicationTaskId != null) __obj.updateDynamic("replicationTaskId")(replicationTaskId.asInstanceOf[js.Any])
    if (replicationTaskSettings != null) __obj.updateDynamic("replicationTaskSettings")(replicationTaskSettings.asInstanceOf[js.Any])
    if (sourceEndpointArn != null) __obj.updateDynamic("sourceEndpointArn")(sourceEndpointArn.asInstanceOf[js.Any])
    if (tableMappings != null) __obj.updateDynamic("tableMappings")(tableMappings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetEndpointArn != null) __obj.updateDynamic("targetEndpointArn")(targetEndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTaskState]
  }
}

