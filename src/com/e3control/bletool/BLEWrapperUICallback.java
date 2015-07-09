package com.e3control.bletool;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

public interface BLEWrapperUICallback {
	//	Callback triggered as a result of a remote characteristic notification.
	public void	 onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic);
	
	//  Callback reporting the result of a characteristic read operation.
	public void	 onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status);
	
	//	Callback indicating the r esult of a characteristic write operation.
	public void	 onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status);
	
	//	Callback indicating when GATT client has connected/disconnected to/from a remote GATT server.
	public void	 onConnectionStateChange(BluetoothGatt gatt, int status, int newState);
	
	//	Callback reporting the result of a descriptor read operation.
	public void	 onDescriptorRead(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status);
	
	//Callback indicating the result of a descriptor write operation.
	public void	 onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status);
	
	//Callback reporting the RSSI for a remote device connection.
	public void	 onReadRemoteRssi(BluetoothGatt gatt, int rssi, int status);
	
	//Callback invoked when a reliable write transaction has been completed.
	public void	 onReliableWriteCompleted(BluetoothGatt gatt, int status);
	
	//Callback invoked when the list of remote services, characteristics and descriptors for the remote device have been updated, ie new services have been discovered.
	public void	 onServicesDiscovered(BluetoothGatt gatt, int status);
	
	
	public static class Null implements BLEWrapperUICallback{

		@Override
		public void onCharacteristicChanged(BluetoothGatt gatt,
				BluetoothGattCharacteristic characteristic) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onCharacteristicRead(BluetoothGatt gatt,
				BluetoothGattCharacteristic characteristic, int status) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onCharacteristicWrite(BluetoothGatt gatt,
				BluetoothGattCharacteristic characteristic, int status) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onConnectionStateChange(BluetoothGatt gatt, int status,
				int newState) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onDescriptorRead(BluetoothGatt gatt,
				BluetoothGattDescriptor descriptor, int status) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onDescriptorWrite(BluetoothGatt gatt,
				BluetoothGattDescriptor descriptor, int status) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onReadRemoteRssi(BluetoothGatt gatt, int rssi, int status) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onReliableWriteCompleted(BluetoothGatt gatt, int status) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onServicesDiscovered(BluetoothGatt gatt, int status) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
