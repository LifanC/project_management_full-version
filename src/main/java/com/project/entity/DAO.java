package com.project.entity;

import java.sql.*;

public class DAO {
	public static Connection conn=DbConnection.getConnection();
	
	public static void updateData(Project project) throws SQLException {
		PreparedStatement ps=null;
		PreparedStatement quantity=null;
		String sql = "update product_object.project set product_object.project.name = ?, product_object.project.count = ?, product_object.project.price = ?, product_object.project.day = ?, product_object.project.text = ? where id = ?";
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setString(1, project.getName());
			ps.setInt(2, project.getCount());
			ps.setInt(3, project.getPrice());
			ps.setString(4, project.getDay());
			ps.setString(5, project.getText());
			ps.setInt(6, project.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(conn!=null) {
				try {
					System.err.print("Transaction is being rolled back");
					conn.rollback();
				} catch (SQLException excep) {
					System.out.println(excep.getMessage());
				}
			}
		}finally {
			conn.setAutoCommit(true);
			if(ps != null) {
				ps.close();
			}
			if(quantity != null) {
				quantity.close();
			}
		}
	}
	
	public static void updateCount(ProjectCount projectCount) throws SQLException {
	    PreparedStatement updateProductid = null;
	    PreparedStatement updateQuantity = null;
	    String updateString = "update product_object.project set product_object.project.count = ? where number = ?";
	    try {		      
	    	conn.setAutoCommit(false);
	        updateProductid = conn.prepareStatement(updateString);
	            updateProductid.setInt(1, projectCount.getCount());
	            updateProductid.setString(2, projectCount.getTempnumber());
	            updateProductid.executeUpdate();
	        
	    } catch (Exception e ) {
	        System.out.println(e.getMessage());
	        if (conn != null) {
	            try {
	                System.err.print("Transaction is being rolled back");
	                conn.rollback();
	            } catch(SQLException excep) {
	                System.out.println(excep.getMessage());
	            }
	        }
	    } finally {
	    	conn.setAutoCommit(true);
	        if (updateProductid != null) {
	            updateProductid.close();
	        }
	        if (updateQuantity != null) {
	            updateQuantity.close();
	        }
	        
	    }
	
	}
	
	public static void updateDaybuy(ProjectCount projectCount) throws SQLException {
	    PreparedStatement updateProductid = null;
	    PreparedStatement updateQuantity = null;
	    String updateString = "update product_object.project set product_object.project.buyday = ? where number = ?";
	    try {		      
	    	conn.setAutoCommit(false);
	        updateProductid = conn.prepareStatement(updateString);
	            updateProductid.setString(1, projectCount.getBuydaytime());
	            updateProductid.setString(2, projectCount.getTempnumber());
	            updateProductid.executeUpdate();
	        
	    } catch (Exception e ) {
	        System.out.println(e.getMessage());
	        if (conn != null) {
	            try {
	                System.err.print("Transaction is being rolled back");
	                conn.rollback();
	            } catch(SQLException excep) {
	                System.out.println(excep.getMessage());
	            }
	        }
	    } finally {
	    	conn.setAutoCommit(true);
	        if (updateProductid != null) {
	            updateProductid.close();
	        }
	        if (updateQuantity != null) {
	            updateQuantity.close();
	        }
	        
	    }
	
	}

	public static void updateDaysell(ProjectCount projectCount) throws SQLException {
	    PreparedStatement updateProductid = null;
	    PreparedStatement updateQuantity = null;
	    String updateString = "update product_object.project set product_object.project.sellday = ? where number = ?";
	    try {		      
	    	conn.setAutoCommit(false);
	        updateProductid = conn.prepareStatement(updateString);
	        	updateProductid.setString(1, projectCount.getSelldaytime());
	            updateProductid.setString(2, projectCount.getTempnumber());
	            updateProductid.executeUpdate();
	        
	    } catch (Exception e ) {
	        System.out.println(e.getMessage());
	        if (conn != null) {
	            try {
	                System.err.print("Transaction is being rolled back");
	                conn.rollback();
	            } catch(SQLException excep) {
	                System.out.println(excep.getMessage());
	            }
	        }
	    } finally {
	    	conn.setAutoCommit(true);
	        if (updateProductid != null) {
	            updateProductid.close();
	        }
	        if (updateQuantity != null) {
	            updateQuantity.close();
	        }
	        
	    }
	}
	
}


























