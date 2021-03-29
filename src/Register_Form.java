 



/*public Register_Form() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        jPanel_title.setBorder(jpanel_title_border);
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
    Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
        jTextField_Username.setBorder(field_border);
        jTextField_Fullname.setBorder(field_border);
        jTextField_Phone.setBorder(field_border);
        jPasswordField_1.setBorder(field_border);
        jPasswordField_2.setBorder(field_border);
        

        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_Male);
        bg.add(jRadioButton_Female);
    }
private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {                                             
        this.setState(JFrame.ICONIFIED);

    }                                            

private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {                                          
        System.exit(0);
    }                                         


           
    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {                                          
       if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }

    private void jButton_SelectImageActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        String path = null;
        
        JFileChooser chooser = new JFileChooser();
        
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter extension = new FileNameExtensionFilter("*.Images","jpg","png","jpeg");
        chooser.addChoosableFileFilter(extension);
        
        int filestate = chooser.showSaveDialog(null);
        if(filestate == JFileChooser.APPROVE_OPTION){
            
            File selectedImage = chooser.getSelectedFile();
            path = selectedImage.getAbsolutePath();
            jLabel_imgpath.setText(path);
            
            image_path = path;
        }
        
    }                                                   
    

    public boolean verifyFields()
    {
        String fname = jTextField_Fullname.getText();
        String uname = jTextField_Username.getText();
        String phone = jTextField_Phone.getText();
        String pass1 = String.valueOf(jPasswordField_1.getPassword());
        String pass2 = String.valueOf(jPasswordField_2.getPassword());
        if(fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("")
           || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        else if(!pass1.equals(pass2))
        {
           JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
           return false;
        }
    
        else{
            return true;
        }
    }
    
    

    public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `users` WHERE `username` = ?";
        
        try {
            
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }
private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {                                                 

         String fname = jTextField_Fullname.getText();
         String username = jTextField_Username.getText();
         String pass1 = String.valueOf(jPasswordField_1.getPassword());
         String pass2 = String.valueOf(jPasswordField_2.getPassword());
         String phone = jTextField_Phone.getText();
         String gender = "Male";
         
         if(jRadioButton_Female.isSelected()){
             gender = "Female";
         }
         if(verifyFields())
         {
             if(!checkUsername(username))
             {
                 PreparedStatement ps;
                 ResultSet rs;
                 String registerUserQuery = "INSERT INTO `users`(`full_name`, `username`, `password`, `phone`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
                 
                 try {
                     
                     ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
                     ps.setString(1, fname);
                     ps.setString(2, username);
                     ps.setString(3, pass1);
                     ps.setString(4, phone);
                     ps.setString(5, gender);
                     
                     try {
                        
                         if(image_path != null){
                         
                             InputStream image = new FileInputStream(new File(image_path));
                             ps.setBlob(6, image);
                             
                         }else{
                             ps.setNull(6, java.sql.Types.NULL);
                         }
                         
                         if(ps.executeUpdate() != 0){
                             JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                         }
                         
                     } catch (FileNotFoundException ex) {
                         Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     
                 } catch (SQLException ex) {
                     Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
         }*/
       
