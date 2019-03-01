package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Adds an access config to an instance's network interface. */
  def addAccessConfig(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstance): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves aggregated list of instances. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[InstanceAggregatedList]
  /**
    * Attaches an existing Disk resource to an instance. You must first create the disk before you can attach it. It is not possible to create and attach a
    * disk at the same time. For more information, read Adding a persistent disk to your instance.
    */
  def attachDisk(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes an access config from an instance's network interface. */
  def deleteAccessConfig(request: gapiDotClientDotComputeLib.Anon_AccessConfig): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Detaches a disk from an instance. */
  def detachDisk(request: gapiDotClientDotComputeLib.Anon_AltDeviceName): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified Instance resource. Get a list of available instances by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Instance]
  /** Returns the specified instance's serial port output. */
  def getSerialPortOutput(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKeyOauthtokenPort): gapiDotClientLib.gapiNs.clientNs.Request[SerialPortOutput]
  /** Creates an instance resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of instances contained within the specified zone. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[InstanceList]
  /** Performs a reset on the instance. For more information, see Resetting an instance. */
  def reset(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the auto-delete flag for a disk attached to an instance. */
  def setDiskAutoDelete(request: gapiDotClientDotComputeLib.Anon_AltAutoDelete): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets labels on an instance. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes the number and/or type of accelerator for a stopped instance to the values specified in the request. */
  def setMachineResources(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes the machine type for a stopped instance to the machine type specified in the request. */
  def setMachineType(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets metadata for the specified instance to the data included in the request. */
  def setMetadata(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Changes the minimum CPU platform that this instance should use. This method can only be called on a stopped instance. For more information, read
    * Specifying a Minimum CPU Platform.
    */
  def setMinCpuPlatform(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets an instance's scheduling options. */
  def setScheduling(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the service account on the instance. For more information, read Changing the service account and access scopes for an instance. */
  def setServiceAccount(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets tags for the specified instance to the data included in the request. */
  def setTags(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def start(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def startWithEncryptionKey(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute,
    * virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP
    * addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
    */
  def stop(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    addAccessConfig: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstance, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[InstanceAggregatedList]
    ],
    attachDisk: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    deleteAccessConfig: js.Function1[
      gapiDotClientDotComputeLib.Anon_AccessConfig, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    detachDisk: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltDeviceName, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Instance]
    ],
    getSerialPortOutput: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKeyOauthtokenPort, 
      gapiDotClientLib.gapiNs.clientNs.Request[SerialPortOutput]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[InstanceList]
    ],
    reset: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setDiskAutoDelete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltAutoDelete, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setLabels: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setMachineResources: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setMachineType: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setMetadata: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setMinCpuPlatform: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setScheduling: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setServiceAccount: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setTags: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    start: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    startWithEncryptionKey: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    stop: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(addAccessConfig = addAccessConfig, aggregatedList = aggregatedList, attachDisk = attachDisk, delete = delete, deleteAccessConfig = deleteAccessConfig, detachDisk = detachDisk, get = get, getSerialPortOutput = getSerialPortOutput, insert = insert, list = list, reset = reset, setDiskAutoDelete = setDiskAutoDelete, setLabels = setLabels, setMachineResources = setMachineResources, setMachineType = setMachineType, setMetadata = setMetadata, setMinCpuPlatform = setMinCpuPlatform, setScheduling = setScheduling, setServiceAccount = setServiceAccount, setTags = setTags, start = start, startWithEncryptionKey = startWithEncryptionKey, stop = stop)
  
    __obj.asInstanceOf[InstancesResource]
  }
}

