document.getElementById('password').addEventListener('input', validatePassword);
document.getElementById('confirmPassword').addEventListener('input', validateConfirmPassword);
document.getElementById('telephone').addEventListener('input', validateTelephone);
document.getElementById('cccd').addEventListener('input', validateCccd);

function validatePassword() {
    const password = document.getElementById('password').value;
    const passwordError = document.getElementById('passwordError');
    const regex = /^(?=.*[A-Z])(?=.*\d).{7,}$/; // Hơn 6 ký tự, chứa ít nhất một chữ hoa và một số

    if (!regex.test(password)) {
        passwordError.textContent = "Password must be at least 7 characters long and contain at least one uppercase letter and one number.";
    } else {
        passwordError.textContent = "";
    }
}

function validateConfirmPassword() {
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    const confirmPasswordError = document.getElementById('confirmPasswordError');

    if (password !== confirmPassword) {
        confirmPasswordError.textContent = "Passwords do not match!";
    } else {
        confirmPasswordError.textContent = "";
    }
}

function validateTelephone() {
    const telephone = document.getElementById('telephone').value;
    const telephoneError = document.getElementById('telephoneError');

    if (telephone.length !== 10) {
        telephoneError.textContent = "Telephone number must be exactly 10 digits.";
    } else {
        telephoneError.textContent = "";
    }
}

function validateCccd() {
    const cccd = document.getElementById('cccd').value;
    const cccdError = document.getElementById('cccdError');

    if (cccd.length !== 11) {
        cccdError.textContent = "CCCD must be exactly 11 digits.";
    } else {
        cccdError.textContent = "";
    }
}

document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    // Get form values
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    const fullName = document.getElementById('fullName').value;
    const gender = document.getElementById('gender').value;
    const birthday = document.getElementById('birthday').value;
    const address = document.getElementById('address').value;
    const email = document.getElementById('email').value;
    const cccd = document.getElementById('cccd').value;
    const telephone = document.getElementById('telephone').value;

    // Validate password and confirm password
    if (password !== confirmPassword) {
        alert("Passwords do not match!");
        return;
    }

    // Validate other fields as needed
    if (!username || !password || !fullName || !gender || !birthday || !address || !email || !cccd || !telephone) {
        alert("Please fill out all fields!");
        return;
    }

    // Additional validations can be added here

    // If all validations pass, you can proceed with form submission
    alert("Registration successful!");

    // You can now submit the form data to the server or handle it as needed
    // For example, using fetch to send a POST request to your server:
    // fetch('/your-api-endpoint', {
    //     method: 'POST',
    //     headers: {
    //         'Content-Type': 'application/json'
    //     },
    //     body: JSON.stringify({
    //         username,
    //         password,
    //         fullName,
    //         gender,
    //         birthday,
    //         address,
    //         email,
    //         cccd,
    //         telephone
    //     })
    // }).then(response => response.json())
    //   .then(data => console.log(data))
    //   .catch(error => console.error('Error:', error));
});
