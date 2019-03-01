package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceTemplatesResource extends js.Object {
  /**
    * Deletes the specified instance template. If you delete an instance template that is being referenced from another instance group, the instance group
    * will not be able to create or recreate virtual machine instances. Deleting an instance template is permanent and cannot be undone.
    */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceTemplate): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified instance template. Get a list of available instance templates by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceTemplateKey): gapiDotClientLib.gapiNs.clientNs.Request[InstanceTemplate]
  /**
    * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an
    * existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
    */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of instance templates that are contained within the specified project and zone. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[InstanceTemplateList]
}

object InstanceTemplatesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceTemplate, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceTemplateKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[InstanceTemplate]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[InstanceTemplateList]
    ]
  ): InstanceTemplatesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[InstanceTemplatesResource]
  }
}

