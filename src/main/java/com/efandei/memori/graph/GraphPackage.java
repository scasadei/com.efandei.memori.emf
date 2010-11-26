/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.efandei.memori.graph;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.efandei.memori.graph.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com/efandei/memori/graph.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.efandei.memori.graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = com.efandei.memori.graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.efandei.memori.graph.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.efandei.memori.graph.impl.GraphImpl
	 * @see com.efandei.memori.graph.impl.GraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.efandei.memori.graph.impl.GraphIntfImpl <em>Intf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.efandei.memori.graph.impl.GraphIntfImpl
	 * @see com.efandei.memori.graph.impl.GraphPackageImpl#getGraphIntf()
	 * @generated
	 */
	int GRAPH_INTF = 1;

	/**
	 * The number of structural features of the '<em>Intf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_INTF_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.efandei.memori.graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see com.efandei.memori.graph.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for class '{@link com.efandei.memori.graph.GraphIntf <em>Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intf</em>'.
	 * @see com.efandei.memori.graph.GraphIntf
	 * @generated
	 */
	EClass getGraphIntf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.efandei.memori.graph.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.efandei.memori.graph.impl.GraphImpl
		 * @see com.efandei.memori.graph.impl.GraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '{@link com.efandei.memori.graph.impl.GraphIntfImpl <em>Intf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.efandei.memori.graph.impl.GraphIntfImpl
		 * @see com.efandei.memori.graph.impl.GraphPackageImpl#getGraphIntf()
		 * @generated
		 */
		EClass GRAPH_INTF = eINSTANCE.getGraphIntf();

	}

} //GraphPackage
