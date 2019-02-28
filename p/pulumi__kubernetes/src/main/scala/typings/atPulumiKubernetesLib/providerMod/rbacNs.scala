package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "rbac")
@js.native
object rbacNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    class ClusterRole protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1.ClusterRole resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRole) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRole, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * AggregationRule is an optional field that describes how to build the Rules for this
        * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
        * changes to Rules will be stomped by the controller.
        */
      val aggregationRule: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.AggregationRule] = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Rules holds all the PolicyRules for this ClusterRole
        */
      val rules: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRole = js.native
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    class ClusterRoleBinding protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1.ClusterRoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
        * resolved, the Authorizer must return an error.
        */
      val roleRef: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
      /**
        * Subjects holds references to the objects the role applies to.
        */
      val subjects: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBinding = js.native
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    class ClusterRoleBindingList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1.ClusterRoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
          ] = js.native
      /**
        * Items is a list of ClusterRoleBindings
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRoleBinding]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBindingList = js.native
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    class ClusterRoleList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1.ClusterRoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
          ] = js.native
      /**
        * Items is a list of ClusterRoles
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.ClusterRole]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleList = js.native
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    class Role protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1.Role resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.Role) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.Role, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Rules holds all the PolicyRules for this Role
        */
      val rules: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.PolicyRule]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.Role = js.native
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    class RoleBinding protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1.RoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
        * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        */
      val roleRef: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleRef] = js.native
      /**
        * Subjects holds references to the objects the role applies to.
        */
      val subjects: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Subject]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBinding = js.native
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    class RoleBindingList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1.RoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
          ] = js.native
      /**
        * Items is a list of RoleBindings
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.RoleBinding]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBindingList = js.native
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    class RoleList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1.RoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
          ] = js.native
      /**
        * Items is a list of Roles
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1Ns.Role]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleList = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRole extends js.Object {
      /**
        * Get the state of an existing `ClusterRole` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRole = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRole = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleBinding extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBinding = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBinding = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleBindingList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBindingList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBindingList = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleList = js.native
    }
    
    /* static members */
    @js.native
    object Role extends js.Object {
      /**
        * Get the state of an existing `Role` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.Role = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.Role = js.native
    }
    
    /* static members */
    @js.native
    object RoleBinding extends js.Object {
      /**
        * Get the state of an existing `RoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBinding = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBinding = js.native
    }
    
    /* static members */
    @js.native
    object RoleBindingList extends js.Object {
      /**
        * Get the state of an existing `RoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBindingList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBindingList = js.native
    }
    
    /* static members */
    @js.native
    object RoleList extends js.Object {
      /**
        * Get the state of an existing `RoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleList = js.native
    }
    
  }
  
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    class ClusterRole protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1alpha1.ClusterRole resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRole) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRole, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * AggregationRule is an optional field that describes how to build the Rules for this
        * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
        * changes to Rules will be stomped by the controller.
        */
      val aggregationRule: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.AggregationRule] = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Rules holds all the PolicyRules for this ClusterRole
        */
      val rules: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRole = js.native
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    class ClusterRoleBinding protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1alpha1.ClusterRoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
        * resolved, the Authorizer must return an error.
        */
      val roleRef: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
      /**
        * Subjects holds references to the objects the role applies to.
        */
      val subjects: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding = js.native
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    class ClusterRoleBindingList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1alpha1.ClusterRoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Items is a list of ClusterRoleBindings
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList = js.native
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    class ClusterRoleList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1alpha1.ClusterRoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Items is a list of ClusterRoles
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.ClusterRole]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleList = js.native
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    class Role protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1alpha1.Role resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.Role) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.Role, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Rules holds all the PolicyRules for this Role
        */
      val rules: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.PolicyRule]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.Role = js.native
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    class RoleBinding protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1alpha1.RoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
        * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        */
      val roleRef: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleRef] = js.native
      /**
        * Subjects holds references to the objects the role applies to.
        */
      val subjects: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Subject]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBinding = js.native
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    class RoleBindingList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1alpha1.RoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Items is a list of RoleBindings
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.RoleBinding]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBindingList = js.native
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    class RoleList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1alpha1.RoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Items is a list of Roles
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns.Role]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleList = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRole extends js.Object {
      /**
        * Get the state of an existing `ClusterRole` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRole = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRole = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleBinding extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBinding = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBinding = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleBindingList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleList = js.native
    }
    
    /* static members */
    @js.native
    object Role extends js.Object {
      /**
        * Get the state of an existing `Role` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Role = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Role = js.native
    }
    
    /* static members */
    @js.native
    object RoleBinding extends js.Object {
      /**
        * Get the state of an existing `RoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBinding = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBinding = js.native
    }
    
    /* static members */
    @js.native
    object RoleBindingList extends js.Object {
      /**
        * Get the state of an existing `RoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBindingList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBindingList = js.native
    }
    
    /* static members */
    @js.native
    object RoleList extends js.Object {
      /**
        * Get the state of an existing `RoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleList = js.native
    }
    
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    class ClusterRole protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1beta1.ClusterRole resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRole) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRole, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * AggregationRule is an optional field that describes how to build the Rules for this
        * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
        * changes to Rules will be stomped by the controller.
        */
      val aggregationRule: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.AggregationRule] = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRole] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Rules holds all the PolicyRules for this ClusterRole
        */
      val rules: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRole = js.native
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    class ClusterRoleBinding protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1beta1.ClusterRoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBinding] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
        * resolved, the Authorizer must return an error.
        */
      val roleRef: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
      /**
        * Subjects holds references to the objects the role applies to.
        */
      val subjects: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBinding = js.native
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    class ClusterRoleBindingList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1beta1.ClusterRoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Items is a list of ClusterRoleBindings
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRoleBinding]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleBindingList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBindingList = js.native
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    class ClusterRoleList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1beta1.ClusterRoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Items is a list of ClusterRoles
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.ClusterRole]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ClusterRoleList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleList = js.native
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    class Role protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1beta1.Role resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.Role) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.Role, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Role] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Rules holds all the PolicyRules for this Role
        */
      val rules: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.PolicyRule]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.Role = js.native
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    class RoleBinding protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1beta1.RoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBinding] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
        * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        */
      val roleRef: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleRef] = js.native
      /**
        * Subjects holds references to the objects the role applies to.
        */
      val subjects: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Subject]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBinding = js.native
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    class RoleBindingList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1beta1.RoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Items is a list of RoleBindings
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.RoleBinding]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleBindingList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBindingList = js.native
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    class RoleList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a rbac.v1beta1.RoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Items is a list of Roles
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns.Role]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList] = js.native
      /**
        * Standard object's metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleList = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRole extends js.Object {
      /**
        * Get the state of an existing `ClusterRole` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRole = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRole = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleBinding extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBinding = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBinding = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleBindingList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBindingList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBindingList = js.native
    }
    
    /* static members */
    @js.native
    object ClusterRoleList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleList = js.native
    }
    
    /* static members */
    @js.native
    object Role extends js.Object {
      /**
        * Get the state of an existing `Role` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.Role = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.Role = js.native
    }
    
    /* static members */
    @js.native
    object RoleBinding extends js.Object {
      /**
        * Get the state of an existing `RoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBinding = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBinding = js.native
    }
    
    /* static members */
    @js.native
    object RoleBindingList extends js.Object {
      /**
        * Get the state of an existing `RoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBindingList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBindingList = js.native
    }
    
    /* static members */
    @js.native
    object RoleList extends js.Object {
      /**
        * Get the state of an existing `RoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleList = js.native
    }
    
  }
  
}

