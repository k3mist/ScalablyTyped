package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Request that a new Project be created. The result is an Operation which
    * can be used to track the creation process. It is automatically deleted
    * after a few hours, so there is no need to call DeleteOperation.
    *
    * Our SLO permits Project creation to take up to 30 seconds at the 90th
    * percentile. As of 2016-08-29, we are observing 6 seconds 50th percentile
    * latency. 95th percentile latency is around 11 seconds. We recommend
    * polling at the 5th second with an exponential backoff.
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.projects.create` on the specified parent for the new
    * project.
    */
  def create(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Marks the Project identified by the specified
    * `project_id` (for example, `my-project-123`) for deletion.
    * This method will only affect the Project if the following criteria are met:
    *
    * + The Project does not have a billing account associated with it.
    * + The Project has a lifecycle state of
    * ACTIVE.
    *
    * This method changes the Project's lifecycle state from
    * ACTIVE
    * to DELETE_REQUESTED.
    * The deletion starts at an unspecified time,
    * at which point the Project is no longer accessible.
    *
    * Until the deletion completes, you can check the lifecycle state
    * checked by retrieving the Project with GetProject,
    * and the Project remains visible to ListProjects.
    * However, you cannot update the project.
    *
    * After the deletion completes, the Project is not retrievable by
    * the  GetProject and
    * ListProjects methods.
    *
    * The caller must have modify permissions for this Project.
    */
  def delete(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Retrieves the Project identified by the specified
    * `project_id` (for example, `my-project-123`).
    *
    * The caller must have read permissions for this Project.
    */
  def get(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Project]
  /**
    * Gets a list of ancestors in the resource hierarchy for the Project
    * identified by the specified `project_id` (for example, `my-project-123`).
    *
    * The caller must have read permissions for this Project.
    */
  def getAncestry(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[GetAncestryResponse]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  /**
    * Returns the IAM access control policy for the specified Project.
    * Permission is denied if the policy or the resource does not exist.
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.projects.getIamPolicy` on the project
    */
  def getIamPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  /**
    * Lists Projects that are visible to the user and satisfy the
    * specified filter. This method returns Projects in an unspecified order.
    * New Projects do not necessarily appear at the end of the list.
    */
  def list(
    request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListProjectsResponse]
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListAvailableOrgPolicyConstraintsResponse]
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListOrgPoliciesResponse]
  /**
    * Sets the IAM access control policy for the specified Project. Replaces
    * any existing policy.
    *
    * The following constraints apply when using `setIamPolicy()`:
    *
    * + Project does not support `allUsers` and `allAuthenticatedUsers` as
    * `members` in a `Binding` of a `Policy`.
    *
    * + The owner role can be granted only to `user` and `serviceAccount`.
    *
    * + Service accounts can be made owners of a project directly
    * without any restrictions. However, to be added as an owner, a user must be
    * invited via Cloud Platform console and must accept the invitation.
    *
    * + A user cannot be granted the owner role using `setIamPolicy()`. The user
    * must be granted the owner role using the Cloud Platform Console and must
    * explicitly accept the invitation.
    *
    * + Invitations to grant the owner role cannot be sent using
    * `setIamPolicy()`;
    * they must be sent only using the Cloud Platform Console.
    *
    * + Membership changes that leave the project without any owners that have
    * accepted the Terms of Service (ToS) will be rejected.
    *
    * + If the project is not part of an organization, there must be at least
    * one owner who has accepted the Terms of Service (ToS) agreement in the
    * policy. Calling `setIamPolicy()` to remove the last ToS-accepted owner
    * from the policy will fail. This restriction also applies to legacy
    * projects that no longer have owners who have accepted the ToS. Edits to
    * IAM policies will be rejected until the lack of a ToS-accepting owner is
    * rectified.
    *
    * + Calling this method requires enabling the App Engine Admin API.
    *
    * Note: Removing service accounts from policies or changing their roles
    * can render services completely inoperable. It is important to understand
    * how the service account is being used before removing or updating its
    * roles.
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.projects.setIamPolicy` on the project
    */
  def setIamPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  /**
    * Returns permissions that a caller has on the specified Project.
    *
    * There are no permissions required for making this API call.
    */
  def testIamPermissions(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
  /**
    * Restores the Project identified by the specified
    * `project_id` (for example, `my-project-123`).
    * You can only use this method for a Project that has a lifecycle state of
    * DELETE_REQUESTED.
    * After deletion starts, the Project cannot be restored.
    *
    * The caller must have modify permissions for this Project.
    */
  def undelete(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Updates the attributes of the Project identified by the specified
    * `project_id` (for example, `my-project-123`).
    *
    * The caller must have modify permissions for this Project.
    */
  def update(request: gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Project]
}

object ProjectsResource {
  @scala.inline
  def apply(
    clearOrgPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    create: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Project]
    ],
    getAncestry: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetAncestryResponse]
    ],
    getEffectiveOrgPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
    ],
    getIamPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    getOrgPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
    ],
    list: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListProjectsResponse]
    ],
    listAvailableOrgPolicyConstraints: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListAvailableOrgPolicyConstraintsResponse]
    ],
    listOrgPolicies: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListOrgPoliciesResponse]
    ],
    setIamPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Policy]
    ],
    setOrgPolicy: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
    ],
    testIamPermissions: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
    ],
    undelete: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    update: js.Function1[
      gapiDotClientDotCloudresourcemanagerLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Project]
    ]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = clearOrgPolicy, create = create, delete = delete, get = get, getAncestry = getAncestry, getEffectiveOrgPolicy = getEffectiveOrgPolicy, getIamPolicy = getIamPolicy, getOrgPolicy = getOrgPolicy, list = list, listAvailableOrgPolicyConstraints = listAvailableOrgPolicyConstraints, listOrgPolicies = listOrgPolicies, setIamPolicy = setIamPolicy, setOrgPolicy = setOrgPolicy, testIamPermissions = testIamPermissions, undelete = undelete, update = update)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

